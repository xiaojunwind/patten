package wind.patten.prototype;

import java.io.Serializable;


/**
 * 
 * 
 * @author xiaojun
 * @date
 */
public class SysSenceContentExtendTmpEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//
	private Long senceId;
	//场景节点标识
	private Long senceContentId;
	//近似问法
	private String extendQuestion;
	//近似问法核心词
	private String extendKeyword;
	
	private String username;
	
	public SysSenceContentExtendTmpEntity(){
		super();
	}
	
	public SysSenceContentExtendTmpEntity(SysSenceContentExtendEntity sscee) {
		this.senceId = sscee.getSenceId();
		this.extendQuestion = sscee.getExtendQuestion();
		this.extendKeyword = sscee.getExtendKeyword();
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
	public Long getSenceId() {
		return senceId;
	}
	public void setSenceId(Long senceId) {
		this.senceId = senceId;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
