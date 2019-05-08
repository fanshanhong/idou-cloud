package com.fan.idou.api.result;

/**
 * @Description: 自定义响应数据结构
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 */
public class IDouJSONResult {

    // 响应业务状态码
    private int status;

    // 响应消息
    private String msg;

    // 返回的数据
    private Object data;

    /**
     * 构造一个 IDouJSONResult 对象用于返回
     *
     * @param status 状态码
     * @param msg    响应消息
     * @param data   返回的数据
     * @return
     */
    public static IDouJSONResult build(int status, String msg, Object data) {
        return new IDouJSONResult(status, msg, data);
    }

    /**
     * 请求成功返回一个 IDouJSONResult 对象, data 中携带应该返回的数据
     *
     * @param data
     * @return
     */
    public static IDouJSONResult ok(Object data) {
        return new IDouJSONResult(data);
    }

    public static IDouJSONResult ok() {
        return new IDouJSONResult(null);
    }

    /**
     * 出现错误返回一个 IDouJSONResult 对象, msg 中是出错的原因/提示
     *
     * @param msg
     * @return
     */
    public static IDouJSONResult errorMsg(String msg) {
        return new IDouJSONResult(500, msg, null);
    }


    public static IDouJSONResult errorMap(Object data) {
        return new IDouJSONResult(501, "error", data);
    }

    /**
     * 用户验证失败, 返回一个 IDouJSONResult 对象, msg中是出错的原因/提示
     *
     * @param msg
     * @return
     */
    public static IDouJSONResult errorTokenMsg(String msg) {
        return new IDouJSONResult(502, msg, null);
    }

    /**
     * 抛出异常
     *
     * @param msg
     * @return
     */
    public static IDouJSONResult errorException(String msg) {
        return new IDouJSONResult(555, msg, null);
    }

    private IDouJSONResult(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private IDouJSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
