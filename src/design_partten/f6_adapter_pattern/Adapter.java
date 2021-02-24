package design_partten.f6_adapter_pattern;

/**
 * 适配器 (类适配器方式)
 * (相当于usb和ps/2的转接器)
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}


