# _001_DialogNumer
Android 基础知识__001_电话拨号

【bug1】拨打电话的权限不够，需要在AndroidManifest.xml中声明权限；
{
10-14 11:24:02.135 2067-2067/? E/AndroidRuntime: FATAL EXCEPTION: main
Process: com.example.administrator.a001_dialognum, PID: 2067
java.lang.SecurityException: Permission Denial: 
    starting Intent { act=android.intent.action.CALL dat=tel:xxx cmp=com.android.server.telecom/.CallActivity } 
	from ProcessRecord{9d2dc11 2067:com.example.administrator.a001_dialognum/u0a53} (pid=2067, uid=10053) 
	requires android.permission.CALL_PHONE
}
【解决方法】
添加权限：打电话的权限
