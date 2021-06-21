package com.louis.gapoex.extension

import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.louis.gapoex.App
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

fun Disposable.disposedBy(compositeDisposable: CompositeDisposable){
    compositeDisposable.add(this)
}

fun <T> Single<T>.applyOn(): Single<T> {
    return this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}

fun Fragment.addChildFragment(fragment: Fragment, container: Int, TAG: String = "") {
    childFragmentManager.beginTransaction()
        .add(container, fragment, TAG)
        .addToBackStack(TAG)
        .commit()
}

fun Fragment.removeChildFragment(fragment: Fragment, TAG: String = "") {
    childFragmentManager.beginTransaction()
        .remove(fragment)
        .commit()
    childFragmentManager.popBackStack()
}

fun Fragment.replaceChildFragment(fragment: Fragment, frameId: Int, onBackStack: Boolean = false, tag: String? = null) {
    val transaction = childFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
    transaction.replace(frameId, fragment, tag)
    if (onBackStack) {
        transaction.addToBackStack(null)
    }
    transaction.commit()
}

@ColorInt
fun Int.getColor(): Int {
    return ResourcesCompat.getColor(App.shared().resources, this, null)
}

fun Int.getString(): String{
    return App.shared().getString(this)
}

fun Int.getDrawable(): Drawable? {
    return ResourcesCompat.getDrawable(App.shared().resources, this, null)
}