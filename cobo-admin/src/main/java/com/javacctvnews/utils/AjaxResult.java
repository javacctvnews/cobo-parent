package com.javacctvnews.utils;

public class AjaxResult {
	private boolean success = true;
	private String msg;

	public AjaxResult(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public AjaxResult(String msg) {
		this.success = false;
		this.msg = msg;
	}

	public void setMsg(String msg) {
		this.success = false;
		this.msg = msg;
	}

	public AjaxResult() {
		super();
	}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }
}
