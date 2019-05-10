package wind.patten.prototype;

import java.io.Serializable;


/**
 * 
 * 
 * @author xiaojun
 * @date
 */
public class SysSenceContentExtendEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//场景节点标识
	private Long senceContentId;
	//近似问法
	private String extendQuestion;
	//近似问法核心词
	private String extendKeyword;

	private Long senceId;
	
	public SysSenceContentExtendEntity() {
		super();
	}
	public SysSenceContentExtendEntity(SysSenceContentExtendTmpEntity sscete) {
		this.senceId = sscete.getSenceId();
		this.extendKeyword = sscete.getExtendKeyword();
		this.extendQuestion = sscete.getExtendQuestion();
	}
	public Long getSenceId() {
		return senceId;
	}
	public void setSenceId(Long senceId) {
		this.senceId = senceId;
	}
	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：场景节点标识
	 */
	public void setSenceContentId(Long senceContentId) {
		this.senceContentId = senceContentId;
	}
	/**
	 * 获取：场景节点标识
	 */
	public Long getSenceContentId() {
		return senceContentId;
	}
	/**
	 * 设置：近似问法
	 */
	public void setExtendQuestion(String extendQuestion) {
		this.extendQuestion = extendQuestion;
	}
	/**
	 * 获取：近似问法
	 */
	public String getExtendQuestion() {
		return extendQuestion;
	}
	/**
	 * 设置：近似问法核心词
	 */
	public void setExtendKeyword(String extendKeyword) {
		this.extendKeyword = extendKeyword;
	}
	/**
	 * 获取：近似问法核心词
	 */
	public String getExtendKeyword() {
		return extendKeyword;
	}
}
