package com.cerva.presenter

import android.os.Bundle


interface Presenter<T> {
  fun bindView(view: T)
  fun onCreate(bundle: Bundle?)
  fun onSaveInstanceState(bundle: Bundle?)
}
