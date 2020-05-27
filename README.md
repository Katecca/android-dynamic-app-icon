# android-dynamic-app-icon

This is an example showing how to change your app icon programatically without depending on specific launcher.

The "trick" is to make use of <activity-alias> (which should be overlooked by many developers) in Android Manifest. Each &lt;activity-alias&gt; is:
- Representing an app icon
- Can be enabled or disabled to make the desired app icon to be either shown or hidden in the launcher
