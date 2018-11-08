# DBHelper

# Step 1. Add the JitPack repository to your build file
  Add it in your root build.gradle at the end of repositories:
    
    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    
# Step 2. Add the dependency

     dependencies {
		implementation 'com.github.sinothk:DBHelper:1.0.1108'
     }

# 使用

  DBHelper.with(this).***


android 数据库操作！Powered By xUtil
