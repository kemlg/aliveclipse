/**
 * 
 */
package net.sf.ictalive.coordination.agents.diagram.oaw.dashboard;

import java.util.LinkedList;
import java.util.List;

import net.sf.ictalive.coordination.agents.diagram.oaw.util.PreferencesUtils;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

/**
 * @author dcorsar
 * 
 */
public class ConfigureAgentPlatformDialog extends TitleAreaDialog {

	private Text agentscapeLocationText, agentscapeServerText, proxyHostText,
			proxyUserText, proxyPasswordText, nonProxyHostsText;
	private Spinner agentscapePortSpinner, proxyPortSpinner,
			maxHeapSizeSpinner;
	private List<Label> labels;
	
	private String agentscapeLocation, agentscapeServer, proxyHost, proxyUser,
			proxyPassword, nonProxyHosts;
	private int agentscapePort, proxyPort, maxHeapSize;
	private ModifyListener checkCompleteListener;

	/**
	 * @param parent
	 */
	public ConfigureAgentPlatformDialog(Shell parent) {
		super(parent);
		labels = new LinkedList<Label>();
		checkCompleteListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				isComplete();
			}
		};
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Configure Agent Platform");
		setHelpAvailable(false);
		setDialogHelpAvailable(false);
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);
		setTitle("AgentScape Details");
		setMessage("Provide details to be used with running AgentScape");
		isComplete();
		return contents;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite c = (Composite) super.createDialogArea(parent);
		Composite comp = new Composite(c, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		comp.setLayout(layout);

		agentscapeLocationText = addTextLabel(
				comp,
				"Location name",
				PreferencesUtils.get(PreferencesUtils.AGENTSCAPE_LOCATION),
				"",
				SWT.SINGLE,
				"The name of the AgentScape location to be created and that the agents will be added to");
		agentscapeLocationText.addModifyListener(checkCompleteListener);
		agentscapeServerText = addTextLabel(
				comp,
				"Server name",
				PreferencesUtils.get(PreferencesUtils.AGENTSCAPE_SERVER),
				"http://localhost",
				SWT.SINGLE,
				"Address of the server running AgentScape (e.g. http://localhost - include the http://)");
		agentscapeServerText.addModifyListener(checkCompleteListener);
		agentscapePortSpinner = addSpinnerLabel(comp, "Port", PreferencesUtils
				.get(PreferencesUtils.AGENTSCAPE_PORT), 5555,
				"Port that AgentScape is running on");

		setTwoColLayoutData(addLabel(comp, "Proxy Details", SWT.BOLD));
		proxyHostText = addTextLabel(comp, "Host name", PreferencesUtils
				.get(PreferencesUtils.PROXY_HOST), "", SWT.SINGLE,
				"Name of the server providing the proxy");
		proxyPortSpinner = addSpinnerLabel(comp, "Port", PreferencesUtils
				.get(PreferencesUtils.PROXY_PORT), -1,
				"Port number on proxy host that should be used for the proxy");
		proxyUserText = addTextLabel(comp, "User name", PreferencesUtils
				.get(PreferencesUtils.PROXY_USER), "", SWT.SINGLE,
				"User name for proxy");
		proxyPasswordText = addTextLabel(comp, "Password", PreferencesUtils
				.get(PreferencesUtils.PROXY_PASSWORD), "", SWT.PASSWORD,
				"Password for proxy");
		nonProxyHostsText = addTextLabel(
				comp,
				"Hosts not to use the proxy for",
				PreferencesUtils.get(PreferencesUtils.NON_PROXY_HOSTS),
				"localhost|127.0.0.1",
				SWT.SINGLE,
				"Host addresses that the proxy should not be used to resolve.  Combine addresses using '|'");

		setTwoColLayoutData(addLabel(comp, "JVM Details", SWT.BOLD));
		maxHeapSizeSpinner = addSpinnerLabel(comp, "Maximum heap size (MB)",
				PreferencesUtils.get(PreferencesUtils.MAX_HEAP_SIZE), 1024,
				"Maximum heap size in MB for the Java VM");

		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#close()
	 */
	@Override
	public boolean close() {
		if (agentscapeLocationText != null) {
			agentscapeLocationText.dispose();
		}
		if (agentscapeServerText != null) {
			agentscapeServerText.dispose();
		}
		;
		if (proxyHostText != null) {
			proxyHostText.dispose();
		}
		if (proxyUserText != null) {
			proxyUserText.dispose();
		}
		if (proxyPasswordText != null) {
			proxyPasswordText.dispose();
		}
		if (nonProxyHostsText != null) {
			proxyPasswordText.dispose();
		}
		if (agentscapePortSpinner != null) {
			proxyPasswordText.dispose();
		}
		if (proxyPortSpinner != null) {
			proxyPortSpinner.dispose();
		}
		if (maxHeapSizeSpinner != null) {
			maxHeapSizeSpinner.dispose();
		}
		for (Label l : labels){
			l.dispose();
		}
		return super.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		agentscapeLocation = agentscapeLocationText.getText();
		agentscapeServer = agentscapeServerText.getText();
		proxyHost = proxyHostText.getText();
		proxyUser = proxyUserText.getText();
		proxyPassword = proxyPasswordText.getText();
		nonProxyHosts = nonProxyHostsText.getText();

		agentscapePort = agentscapePortSpinner.getSelection();
		proxyPort = proxyPortSpinner.getSelection();
		maxHeapSize = maxHeapSizeSpinner.getSelection();

		super.okPressed();
	}

	private void setTwoColLayoutData(Label l) {
		GridData twoColSpanData = new GridData(GridData.GRAB_HORIZONTAL);
		twoColSpanData.horizontalSpan = 2;
		l.setLayoutData(twoColSpanData);
	}

	private Spinner addSpinnerLabel(Composite comp, String labelText,
			String valueString, int alternativeValue, String toolTip) {
		addLabel(comp, labelText, SWT.NULL);
		Spinner s = new Spinner(comp, SWT.BORDER);
		s
				.setValues(
						(valueString == null || "".equals(valueString)) ? alternativeValue
								: Integer.parseInt(valueString), -1,
						Integer.MAX_VALUE, 0, 1, 100);
		s.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		s.setToolTipText(toolTip);
		return s;
	}

	private Text addTextLabel(Composite parent, String labelText,
			String textText, String alternativeTextText, int style,
			String toolTip) {
		addLabel(parent, labelText, SWT.NULL);
		Text t = new Text(parent, style | SWT.BORDER);
		t
				.setText((textText == null || "".equals(textText)) ? alternativeTextText
						: textText);
		t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		t.setToolTipText(toolTip);
		return t;
	}

	private Label addLabel(Composite parent, String labelText, int style) {
		Label l = new Label(parent, style);
		l.setText(labelText);
		labels.add(l);
		return l;
	}

	private boolean isComplete() {
		if ("".equals(getAgentscapeLocationText().getText())) {
			setErrorMessage("AgentScape location must be specified");
			getButton(IDialogConstants.OK_ID).setEnabled(false);
			return false;
		}
		if ("".equals(getAgentscapeServerText().getText())) {
			setErrorMessage("AgentScape server must be specified");
			getButton(IDialogConstants.OK_ID).setEnabled(false);
			return false;
		}
		getButton(IDialogConstants.OK_ID).setEnabled(true);
		setErrorMessage(null);
		return true;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	
	
	/**
	 * @return the agentscapeLocationText
	 */
	public Text getAgentscapeLocationText() {
		return agentscapeLocationText;
	}

	/**
	 * @return the agentscapeServerText
	 */
	public Text getAgentscapeServerText() {
		return agentscapeServerText;
	}

	/**
	 * @return the proxyHostText
	 */
	public Text getProxyHostText() {
		return proxyHostText;
	}

	/**
	 * @return the proxyUserText
	 */
	public Text getProxyUserText() {
		return proxyUserText;
	}

	/**
	 * @return the proxyPasswordText
	 */
	public Text getProxyPasswordText() {
		return proxyPasswordText;
	}

	/**
	 * @return the nonProxyHostsText
	 */
	public Text getNonProxyHostsText() {
		return nonProxyHostsText;
	}

	/**
	 * @return the agentscapePortSpinner
	 */
	public Spinner getAgentscapePortSpinner() {
		return agentscapePortSpinner;
	}

	/**
	 * @return the proxyPortSpinner
	 */
	public Spinner getProxyPortSpinner() {
		return proxyPortSpinner;
	}

	/**
	 * @return the maxHeapSizeSpinner
	 */
	public Spinner getMaxHeapSizeSpinner() {
		return maxHeapSizeSpinner;
	}

	/**
	 * @return the agentscapeLocation
	 */
	public String getAgentscapeLocation() {
		return agentscapeLocation;
	}

	/**
	 * @return the agentscapeServer
	 */
	public String getAgentscapeServer() {
		return agentscapeServer;
	}

	/**
	 * @return the proxyHost
	 */
	public String getProxyHost() {
		return proxyHost;
	}

	/**
	 * @return the proxyUser
	 */
	public String getProxyUser() {
		return proxyUser;
	}

	/**
	 * @return the proxyPassword
	 */
	public String getProxyPassword() {
		return proxyPassword;
	}

	/**
	 * @return the nonProxyHosts
	 */
	public String getNonProxyHosts() {
		return nonProxyHosts;
	}

	/**
	 * @return the agentscapePort
	 */
	public int getAgentscapePort() {
		return agentscapePort;
	}

	/**
	 * @return the proxyPort
	 */
	public int getProxyPort() {
		return proxyPort;
	}

	/**
	 * @return the maxHeapSize
	 */
	public int getMaxHeapSize() {
		return maxHeapSize;
	}

}
