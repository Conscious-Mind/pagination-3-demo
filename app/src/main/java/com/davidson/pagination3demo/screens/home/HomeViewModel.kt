package com.davidson.pagination3demo.screens.home

import androidx.lifecycle.ViewModel
import com.davidson.pagination3demo.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repo: Repository,
) : ViewModel() {
    val getAllImages = repo.getAllImages()
}