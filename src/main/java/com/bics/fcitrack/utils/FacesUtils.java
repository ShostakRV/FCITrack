package com.bics.fcitrack.utils;

import org.apache.commons.lang.StringUtils;

import javax.faces.context.FacesContext;
import javax.faces.context.ExternalContext;
import javax.faces.component.UIViewRoot;
import javax.faces.component.UIComponent;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.el.ExpressionFactory;
import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Locale;

/**
 * 
 * User: id966352 Cosyns Xavier Date: 27-Feb-2009
 */
public class FacesUtils {

	public static FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public static UIViewRoot getViewRoot() {
		return FacesContext.getCurrentInstance().getViewRoot();
	}

	public static Application getApplication() {
		return FacesContext.getCurrentInstance().getApplication();
	}

	public static ExternalContext getExternalContext() {
		return getFacesContext().getExternalContext();
	}

	public static ExpressionFactory getExpressionFactory() {
		return getApplication().getExpressionFactory();
	}

	public static ELContext getELContext() {
		return getFacesContext().getELContext();
	}

	public static String getRequestParam(String paramName) {
		return (String) getExternalContext().getRequestParameterMap().get(paramName);
	}
	
	public static String getSubmittedValue(UIComponent component){
		return getRequestParam(component.getClientId(getFacesContext()));
	}

	/**
	 * get a jsf managed bean
	 * 
	 * @param property
	 * @return
	 */
	public static Object getBean(String property) {
		ValueExpression valueExpression = getApplication().getExpressionFactory().createValueExpression(getELContext(),
				property, Object.class);
		return valueExpression.getValue(getELContext());
	}

	public static void log(String message) {
		getExternalContext().log(message);
	}

	public static void log(String message, Throwable throwable) {
		getExternalContext().log(message, throwable);
	}

	public static MethodExpression createMethodExpression(String expr) {
		return getExpressionFactory().createMethodExpression(getELContext(), expr, null, new Class[] {});
	}

	public static void info(String summary) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, getI18NMessage(summary), null));
	}

	public static void info(UIComponent component, String summary) {
		addMessage(component.getClientId(getFacesContext()),
				new FacesMessage(FacesMessage.SEVERITY_INFO, getI18NMessage(summary), null));
	}

    public static void info(String summary, String... parameters) {
		addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, getI18NMessage(summary, parameters), null));
	}

	public static void warn(String summary) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, getI18NMessage(summary), null));
	}

	public static void warn(UIComponent component, String summary) {
		addMessage(component.getClientId(getFacesContext()),
				new FacesMessage(FacesMessage.SEVERITY_WARN, getI18NMessage(summary), null));
	}

	public static void error(Throwable t) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, t.getClass().getSimpleName()+":"+t.getLocalizedMessage(), null));
	}
	
	public static void error(String summary) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, getI18NMessage(summary), null));
	}

	public static void error(String summary, String... parameters) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, getI18NMessage(summary, parameters), null));
	}

	public static void error(String summary, Object... parameters) {
		addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, getI18NMessage(summary, parameters), null));
	}

	public static void error(UIComponent component, String summary, String... parameters) {
		addMessage(component.getClientId(getFacesContext()),
				new FacesMessage(FacesMessage.SEVERITY_ERROR, getI18NMessage(summary, parameters), null));
	}

	public static void error(UIComponent component, String summary) {
		addMessage(component.getClientId(getFacesContext()),
				new FacesMessage(FacesMessage.SEVERITY_ERROR, getI18NMessage(summary), null));
	}

	public static void fatal(String summary) {
		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, getI18NMessage(summary), null));
	}

	public static void fatal(UIComponent component, String summary) {
		addMessage(component.getClientId(getFacesContext()),
				new FacesMessage(FacesMessage.SEVERITY_FATAL, getI18NMessage(summary), null));
	}

    private static void addMessage(String clientId, FacesMessage message) {
        if (!isMessageAlreadyAdded(clientId, message))
            getFacesContext().addMessage(clientId, message);
    }

    private static boolean isMessageAlreadyAdded(String clientId, FacesMessage message) {
        if (!getFacesContext().getMessages(clientId).hasNext()) return false;

        String summary = getString(message.getSummary(), "");
        String detail = getString(message.getDetail(), "");

        for (Iterator<FacesMessage> iterator =
                getFacesContext().getMessages(clientId); iterator.hasNext();) {
            FacesMessage next = iterator.next();
            if (summary.equals(getString(next.getSummary(), ""))
                    && detail.equals(getString(next.getDetail(), ""))) return true;
        }

        return false;
    }

    private static String getString(String text, String resultIfEmpty) {
        return !StringUtils.isEmpty(text) ? text : resultIfEmpty;
    }

    /**
	 * Get an internationalized message using the default JSF configured
	 * library.
	 * 
	 * @param key
	 *            The message key
	 * @return The internationalized message, or the key if the bundle could not
	 *         be found, or if the key does not exists in the bundle.
	 */
	public static String getI18NMessage(String key) {

		String message = key;
		FacesContext ctx = getFacesContext();
		Locale locale = ctx.getViewRoot().getLocale();
		String bundleName = ctx.getApplication().getMessageBundle();

		if (bundleName != null) {
			ResourceBundle bundle = ResourceBundle
					.getBundle(bundleName, locale, Thread.currentThread().getContextClassLoader());
			if (bundle != null) {
				if (bundle.containsKey(key)) {
					message = bundle.getString(key);
				}
			}
		}
		return message;
	}

	public static String getI18NMessage(String key, String... parameters) {
		String message = getI18NMessage(key);
		MessageFormat form = new MessageFormat(message);
		return form.format(parameters);

	}

	public static String getI18NMessage(String key, Object... parameters) {
		String message = getI18NMessage(key);
		MessageFormat form = new MessageFormat(message);
		return form.format(parameters);

	}

}
