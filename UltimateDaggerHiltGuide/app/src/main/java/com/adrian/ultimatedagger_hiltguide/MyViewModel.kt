package com.adrian.ultimatedagger_hiltguide

import androidx.lifecycle.ViewModel
import com.adrian.ultimatedagger_hiltguide.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
): ViewModel() {

    init {
      //
    }
}