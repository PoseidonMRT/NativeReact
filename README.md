# NativeReact
Android native project which contains React Native module,will show how to combine native code with React Native code.

# How to compile project

The react_native file in the root directory of project which contains all React Native js files,when we change files in this directory ,we must execute following commands in terminal :

```
react-native bundle --platform android --dev false --entry-file react_native/index.js --bundle-output app/src/main/assets/index.a
ndroid.bundle --assets-dest app/src/main/res/
```
this commands will help us to generate index.android.bundle in the `app/src/main/aseets` directory,then we can compile project as the native android project.

when we push codes to github,please do not commit node_modules directory in the root project directory.
