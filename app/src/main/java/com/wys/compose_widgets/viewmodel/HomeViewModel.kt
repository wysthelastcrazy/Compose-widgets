package com.wys.compose_widgets.viewmodel

import androidx.lifecycle.ViewModel

/**
 *@author wangyasheng
 *@date 2024/3/26
 */

data class HomeScreenUiState(
   val selectedTabIndex: Int = 0
)
class HomeViewModel():ViewModel(){

}