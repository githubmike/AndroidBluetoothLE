/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    // mike added this
    public static String GENERIC_ACCESS_SERVICE       = "00001800-0000-1000-8000-00805f9b34fb";
    public static String DEVICE_NAME                  = "00002A00-0000-1000-8000-00805f9b34fb";
    public static String APPEARANCE                   = "00002A01-0000-1000-8000-00805f9b34fb";

    public static String DEVICE_INFORMATION_SERVICE   = "0000180a-0000-1000-8000-00805f9b34fb";

    //public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String MANUFACTURER_NAME_STRING     = "00002a29-0000-1000-8000-00805f9b34fb";

    public static String HEART_RATE_SERVICE           = "0000180d-0000-1000-8000-00805f9b34fb";
    public static String HEART_RATE_MEASUREMENT       = "00002a37-0000-1000-8000-00805f9b34fb";

    public static String CONTROL_A_SERVICE              = "aa65f91e-82c2-4b93-a535-26dcdfd2c83d";
    public static String CONTROL_B_SERVICE              = "ab65f91e-82c2-4b93-a535-26dcdfd2c83d";
    public static String GPIO_CONTROL_R_CHARACTERISTIC  = "4f2c5575-c950-4b5f-8e7a-ee3e340395e7";
    public static String GPIO_CONTROL_W_CHARACTERISTIC  = "5e2c5575-c950-4b5f-8e7a-ee3e340395e7";

    static {
        // Sample Services.
        // https://developer.bluetooth.org/gatt/services/Pages/ServicesHome.aspx
        // attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put(GENERIC_ACCESS_SERVICE,        "Generic Access Service");
        attributes.put(DEVICE_NAME,                   "Device Name");
        attributes.put(APPEARANCE,                    "Appearance");

        attributes.put(DEVICE_INFORMATION_SERVICE,    "Device Information Service");
        attributes.put(MANUFACTURER_NAME_STRING,      "Manufacturer Name");
        //attributes.put(HEART_RATE_SERVICE,            "Heart Rate Service");
        // Sample Characteristics.
        //attributes.put(HEART_RATE_MEASUREMENT,        "Heart Rate Measurement");
        // mike added this
        //attributes.put(CLIENT_CHARACTERISTIC_CONFIG,  "Client Characteristic Config");
        // mike end add
        //attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        // mike added this service characteristic set for Silicon Labs demo card button
        attributes.put(CONTROL_A_SERVICE,                "Control A Service");
        attributes.put(CONTROL_B_SERVICE,                "Control B Service");
        attributes.put(GPIO_CONTROL_R_CHARACTERISTIC,    "GPIO Control READ Characteristic");
        attributes.put(GPIO_CONTROL_W_CHARACTERISTIC,    "GPIO Control WRITE Characteristic");
        // mike end add
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
