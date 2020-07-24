
# react-native-printer-connect

## Getting started

`$ npm install react-native-printer-connect --save`

### Mostly automatic installation

`$ react-native link react-native-printer-connect`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-printer-connect` and add `RNPrinterConnect.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNPrinterConnect.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.nekopit.printer.connect.RNPrinterConnectPackage;` to the imports at the top of the file
  - Add `new RNPrinterConnectPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-printer-connect'
  	project(':react-native-printer-connect').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-printer-connect/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-printer-connect')
  	```


## Usage
```javascript
import RNPrinterConnect from 'react-native-printer-connect';

// TODO: What to do with the module?
RNPrinterConnect;
```
  