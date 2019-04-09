package com.dyh.base.rx

import rx.Subscriber

open class BaseSubscriber<T>: Subscriber<T>() {

    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {

    }

    override fun onCompleted() {

    }

}