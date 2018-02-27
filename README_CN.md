[English](https://github.com/AbbyJM/TSnackbar) | **中文版** </br>
TSnackbar
==========
    一个可以从顶部滑出的snackbar
简介
============
基于官方的snackbar做了一些修改，使TSnackbar支持从顶部滑出。tsnackbar内置了几种提醒的样式ERROR,LOADING,COMPLETE,WARNING，当然也可以自己定义。
  
效果
===========

<div align=center><img width="236" height="384" src="https://github.com/AbbyJM/TSnackbar/raw/master/demo.gif"/></div>   

## Gradle 
		dependencies{
			compile 'com.abby.app:tsnackbar:1.0.7'
		 }
 
## 版本更新
	   v1.0.6:
	      1.添加setHeight方法设置高度
	   v1.0.7
	      1.添加setMessageGravity方法设置Message文本的重心方向
	      2.添加setActionTextSize方法设置action button的尺寸
	      3.更新API版本至26，如果导入依赖后同步失败的话，请更新您的API版本
## 用法
       @Override
       public void onCreate(Bundle savedInstanceState) {
    
           super.onCreate(savedInstanceState);
           TSnackbar.make(getWindow().getDecorView(),"LOADING PLEASE WAIT...",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_LOADING)
                        .show();
          TSnackbar.make(getWindow().getDecorView(),"ERROR OCCURED！",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_ERROR)
                        .show();
          TSnackbar.make(getWindow().getDecorView(),"COMPLETE",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_COMPLETE)
                        .show();
          TSnackbar.make(getWindow().getDecorView(),"LOADING...",TSnackbar.LENGTH_LONG)
                        .setIconRes(R.drawable.ic_wifi_black_24dp)
                        .setBackgroundColor(Color.GREEN)
                        .show();
    }        
    
  
  
    
## 特性
<div>
    <table border="0">
	  <tr>
	    <th>属性名</th>
	    <th>描述</th>
	  </tr>
	  <tr>
	    <td>setShowsDirection</td>
	    <td>设置snackbar滑出的方向，SHOW_FROM_TOP_TO_BOTTOM为顶部滑出，SHOW or SHOW_FROM_BOTTOM_TO_TOP为底部滑出</td>
	  </tr>
    <tr>
       <td>setBackgroundColor</td>
      <td>设置snackbar的背景颜色</td>
    </tr>
    <tr>
       <td>setAlpha</td>
       <td>设置snackbar背景透明度,设置值为0-255</td>
    </tr>
    <tr>
      <td>setMessageTextColor</td>
      <td>设置提醒信息的文本颜色</td>
    </tr>
        <td>setIconRes</td>
        <td>设置图标资源</td>
    <tr>
	    <tr>
		    <td>setIconRes</td>
		    <td>设置图标资源，指定大小，单位为像素</td>
	    </tr>
        <td>setPreDefinedStyle</td>
        <td>设置预定义风格，可以是 STYLE_ERROE,STYLE_COMPLETE,STYLE_LOADING或STYLE_WARNING</td>
    </tr>
    <tr>
        <td>setFadeOrTranslateStyle</td>
        <td>设置snackbar动画效果,STYLE_FADE_OUT为淡出效果,STYLE_FADE_IN为淡入效果,STYLE FADE_IN_FADE_OUT为淡入淡出效果， STYLE_TRANSLATE为平移效果。默认为平移效果</td>
    </tr>
    
    <tr>
      <td>isBelowStatusBar</td>
      <td>指定snackbar是否位于状态栏下方</td>
    </tr>
    <tr>
    	<td>setHeight</td>
	<td>设置snackbar的高度，由于存在padding，建议您将高度设置为大于120dp以防止内容被padding覆盖，***默认的高度是wrap_content***
    </tr>
    
    <tr>
    	<td>setMessageGravity(int grativy)</td>
	<td>设置message文本的重心方向，必须是Gravity.START,Gravity.CENTER或者Gravity.END其中一个，***默认的重心方向是Gravity.START***</td>
    </tr>
    
    <tr>
    	<td>setActionTextSize(float size)</td>
	<td>设置action button的文本尺寸</td>
    </tr>
    
    
   </table>
</div>
 </div>
 
 # License
    Copyright 2017 AbbyJM

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
