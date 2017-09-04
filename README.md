TSnackbar
==========
    A snackbar can be shown from top or bottom.

Introduction
============
It is customizable and easy to use.You can change the style of the snackbar or apply the predefined styles,which are ERROR,LOADING,COMPLETE,WARNING
  
ScreenShot
===========
STYLE_ERROR
<div align=center><img width="216" height="384" src="https://github.com/AbbyJM/TSnackbar/raw/master/screenshot/pic1.png"/></div>   
 
STYLE_COMPLETE
<div align=center><img width="216" height="384" src="https://github.com/AbbyJM/TSnackbar/raw/master/screenshot/pic2.png"/></div>   
 
CUSTOMIZE YOUR ICON
<div align=center><img width="216" height="384" src="https://github.com/AbbyJM/TSnackbar/raw/master/screenshot/pic3.png"/></div>   
 
STYLE_LOADING
<div align=center><img width="216" height="384" src="https://github.com/AbbyJM/TSnackbar/raw/master/screenshot/pic4.png"/></div>   

## Gradle Config
    dependencies{
      compile 'com.abby.app:tsnackbar:0.1.0'
    }

## Usage
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
    
  
    
## Features
<div>
    <table border="0">
	  <tr>
	    <th>name</th>
	    <th>description</th>
	  </tr>
	  <tr>
	    <td>setShowsDirection</td>
	    <td>set the direction the snackbar shows,which can be SHOW_FROM_TOP_TO_BOTTOM or SHOW or SHOW_FROM_BOTTOM_TO_TOP</td>
	  </tr>
    <tr>
       <td>setBackgroundColor</td>
      <td>set the color of the background</td>
    </tr>
    <tr>
       <td>setAlpha</td>
       <td>set the alpha of the background,should be 0 to 255
    </tr>
    <tr>
      <td>setMessageTextColor</td>
      <td>set the color of the message</td>
    </tr>
        <td>setIconRes</td>
        <td>set the Icon resource</td>
    <tr>
        <td>setPreDefinedStyle</td>
        <td>apply the predefined style,which are STYLE_ERROE,STYLE_COMPLETE,STYLE_LOADING,STYLE_WARNING</td>
    </tr>
    <tr>
        <td>setFadeOrTranslateStyle</td>
        <td>set the style the snackbar animate out,which can be STYLE_FADE_OUT or STYLE_TRANSLATE</td>
    </tr>
    </table>
</div>
 </div>
 
 # License
    Copyright 2017 Abby

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
