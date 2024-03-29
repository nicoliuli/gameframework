package com.game.core.call;

import com.game.core.func.Func2;
import com.game.core.util.Param;

/**
 * 封装回调结果
 */
public class ServiceCallback implements SCall {

    public final Integer type = 2;

    private Integer portId;

    private String serviceId;

    /**
     * 1：根据methodKey回调manager方法
     * 2：根据method回调service方法
     */
    private Integer callbackType;

    /**
     * 回调的方法
     */
    private Func2<Object,Param> callbackFunc;

    /**
     * 上下文
     */
    private Param context;

    /**
     * 返回值
     */
    private Object result;

    public ServiceCallback() {
    }

    /**
     * 针对manager回调
     */
    public ServiceCallback(Integer portId, Integer callbackType, Func2<Object,Param> callbackFunc, Param context) {
        this.portId = portId;
        this.callbackType = callbackType;
        this.callbackFunc = callbackFunc;
        this.context = context;
    }

    /**
     * 针对service回调
     */
    public ServiceCallback(Integer portId, String serviceId, Integer callbackType, Func2<Object,Param> callbackFunc, Param context) {
        this.portId = portId;
        this.serviceId = serviceId;
        this.callbackType = callbackType;
        this.callbackFunc = callbackFunc;
        this.context = context;
    }

    @Override
    public Integer getType() {
        return this.type;
    }

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getCallbackType() {
        return callbackType;
    }

    public void setCallbackType(Integer callbackType) {
        this.callbackType = callbackType;
    }

    public Param getContext() {
        return context;
    }

    public void setContext(Param context) {
        this.context = context;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Func2<Object, Param> getCallbackFunc() {
        return callbackFunc;
    }

    public void setCallbackFunc(Func2<Object, Param> callbackFunc) {
        this.callbackFunc = callbackFunc;
    }
}
