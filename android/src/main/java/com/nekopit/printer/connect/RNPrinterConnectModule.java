
package com.nekopit.printer.connect;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNPrinterConnectModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNPrinterConnectModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNPrinterConnect";
  }
}