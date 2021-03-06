package com.smartfrank.pattern.pipeline.context;

import java.util.Map;

/**
 * Description: 模型实例构建上下文
 * <br/>
 * InstanceBuildContext
 *
 * @author laiql
 * @date 2022/6/14 10:12 下午
 */
public class InstanceBuildContext extends PipelineContext {
    /**
     * 模型 id
     */
    private Long modelId;

    /**
     * 用户 id
     */
    private long userId;

    /**
     * 表单输入
     */
    private Map<String, Object> formInput;

    /**
     * 保存模型实例完成后，记录下 id
     */
    private Long instanceId;

    /**
     * 模型创建出错时的错误信息
     */
    private String errorMsg;

    /**
     * 其他参数
     */
    @Override
    public String getPipelineName() {
        return "模型实例构建上下文";
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Map<String, Object> getFormInput() {
        return formInput;
    }

    public void setFormInput(Map<String, Object> formInput) {
        this.formInput = formInput;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
