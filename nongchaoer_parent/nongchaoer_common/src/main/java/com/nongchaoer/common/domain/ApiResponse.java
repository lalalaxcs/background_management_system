package com.nongchaoer.common.domain;

import com.nongchaoer.common.enums.ResponseCode;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author : [xvChuShun]
 * @version : [v1.0]
 * @description : [统一封装结果类]
 * @createTime : [2023/6/27 12:09]
 * @updateUser : [xvChuShun]
 * @updateTime : [2023/6/27 12:09]
 * @updateRemark : [创建统一封装结果类]
 */
@Data
public class ApiResponse<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private T data;
    public ApiResponse(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public ApiResponse(Integer code,String message,T data){
        this(code,message);
        this.data = data;
    }

    public static <T> ApiResponse<T> success(){
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMessage());
    }

    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMessage(),data);
    }

    public static <T> ApiResponse<T> fail(){
        return new ApiResponse<>(ResponseCode.FAILURE.getCode(), ResponseCode.FAILURE.getMessage());
    }

    public static <T> ApiResponse<T> fail(Integer code,String message){
        return new ApiResponse<>(code,message);
    }

    public static <T> ApiResponse<T> error(){
        return new ApiResponse<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
    }
}
