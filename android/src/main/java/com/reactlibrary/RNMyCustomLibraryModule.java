
package com.reactlibrary;

import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

public class RNMyCustomLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNMyCustomLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMyCustomLibrary";
  }

  @ReactMethod
  public void show(String message, int duration){
    Toast.makeText(getReactApplicationContext(),message, duration).show();
  }

  @Override
  public Map<String, Object> getConstants(){
    final Map<String, Object> constants = new HashMap<>();
    constants.put("SHORT-KEY", Toast.LENGTH_SHORT);
    constants.put("LONG-KEY",Toast.LENGTH_LONG);
    return constants;
  }
}