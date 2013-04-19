package edu.bath.alivetemplates;

/**
 * Exception indicating a problem when using templates.
 * @author adan
 *
 */
public class TemplateException extends RuntimeException {
	private static final long serialVersionUID = -4014794146430457338L;

	public TemplateException(String fmt, Object... args) {
		super(MessageHelper.formatMessage(fmt, args));

	}
	public TemplateException(Throwable t,String fmt, Object... args) {
		super(MessageHelper.formatMessage(fmt, args),t);

	}

	public TemplateException(String error) {
		super(error);
	}

	public TemplateException() {
		super();
	}

	public TemplateException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public TemplateException(Throwable throwable) {
		super(throwable);
	}

}