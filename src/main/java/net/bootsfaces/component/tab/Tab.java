/**
 *  Copyright 2014-15 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
 *  
 *  This file is part of BootsFaces.
 *  
 *  BootsFaces is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BootsFaces is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with BootsFaces. If not, see <http://www.gnu.org/licenses/>.
 */

package net.bootsfaces.component.tab;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.behavior.ClientBehaviorHolder;

import net.bootsfaces.component.AttributeMapWrapper;
import net.bootsfaces.component.ajax.IAJAXComponent;
import net.bootsfaces.render.Tooltip;

/** This class holds the attributes of &lt;b:tab /&gt;. */
@FacesComponent("net.bootsfaces.component.tab.Tab")
public class Tab extends UIOutput implements net.bootsfaces.render.IHasTooltip, ClientBehaviorHolder, IAJAXComponent {

	public static final String COMPONENT_TYPE = "net.bootsfaces.component.tab.Tab";

	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";

	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.tab.Tab";
	
	private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(
			Arrays.asList("blur", "change", "valueChange", "click", "dblclick", "focus", "keydown", "keypress", "keyup",
					"mousedown", "mousemove", "mouseout", "mouseover", "mouseup", "select"));

	private Map<String, Object> attributes;

    /**
     * returns the subset of AJAX requests that are implemented by jQuery callback or other non-standard means
     * (such as the onclick event of b:tabView, which has to be implemented manually).
     * @return
     */
    public Map<String, String> getJQueryEvents() {
    	return null;
    }

    public Collection<String> getEventNames() {
		return EVENT_NAMES;
	}

	public String getDefaultEventName() {
		return "valueChange";
	}


	public Tab() {

		Tooltip.addResourceFile();
		setRendererType(DEFAULT_RENDERER);
	}

	@Override
	public Map<String, Object> getAttributes() {
		if (attributes == null)
			attributes = new AttributeMapWrapper(this, super.getAttributes());
		return attributes;
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

    protected enum PropertyKeys {
ajax,
contentStyle,
dir,
disabled,
immediate,
onclick,
oncomplete,
process,
style,
styleClass,
title,
tooltip,
tooltipContainer,
tooltipDelay,
tooltipDelayHide,
tooltipDelayShow,
tooltipPosition,
update
;

        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering error in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipContainer() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipContainer, "body");
		return  value;
	}
	
	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering error in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipContainer(String _tooltipContainer) {
	    getStateHelper().put(PropertyKeys.tooltipContainer, _tooltipContainer);
    }
	/**
	 * Comma or space separated list of ids or search expressions denoting which values are to be sent to the server. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getProcess() {
		String value = (String)getStateHelper().eval(PropertyKeys.process);
		return  value;
	}
	
	/**
	 * Comma or space separated list of ids or search expressions denoting which values are to be sent to the server. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setProcess(String _process) {
	    getStateHelper().put(PropertyKeys.process, _process);
    }

	/**
	 * Activates AJAX. The default value is false (no AJAX). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isAjax() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.ajax, false);
		return (boolean) value;
	}
	
	/**
	 * Activates AJAX. The default value is false (no AJAX). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAjax(boolean _ajax) {
	    getStateHelper().put(PropertyKeys.ajax, _ajax);
    }
	

	/**
	 * Inline CSS of the div surrounding the tab pane. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getContentStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.contentStyle);
		return  value;
	}
	
	/**
	 * Inline CSS of the div surrounding the tab pane. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setContentStyle(String _contentStyle) {
	    getStateHelper().put(PropertyKeys.contentStyle, _contentStyle);
    }
	
	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphebet, based on the page content). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getDir() {
		String value = (String)getStateHelper().eval(PropertyKeys.dir);
		return  value;
	}
	
	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphebet, based on the page content). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDir(String _dir) {
	    getStateHelper().put(PropertyKeys.dir, _dir);
    }

	/**
	 * Disables the input element, default is false. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isDisabled() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.disabled, false);
		return (boolean) value;
	}
	
	/**
	 * Disables the input element, default is false. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDisabled(boolean _disabled) {
	    getStateHelper().put(PropertyKeys.disabled, _disabled);
    }
	

	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isImmediate() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.immediate, false);
		return (boolean) value;
	}
	
	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setImmediate(boolean _immediate) {
	    getStateHelper().put(PropertyKeys.immediate, _immediate);
    }
	

	/**
	 * Optional Javascript function that's called when the tab is clicked. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnclick() {
		String value = (String)getStateHelper().eval(PropertyKeys.onclick);
		return  value;
	}
	
	/**
	 * Optional Javascript function that's called when the tab is clicked. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnclick(String _onclick) {
	    getStateHelper().put(PropertyKeys.onclick, _onclick);
    }
	

	/**
	 * Javascript to be executed when ajax completes with success. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOncomplete() {
		String value = (String)getStateHelper().eval(PropertyKeys.oncomplete);
		return  value;
	}
	
	/**
	 * Javascript to be executed when ajax completes with success. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOncomplete(String _oncomplete) {
	    getStateHelper().put(PropertyKeys.oncomplete, _oncomplete);
    }
	

	/**
	 * Inline CSS of the tab. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.style);
		return  value;
	}
	
	/**
	 * Inline CSS of the tab. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
    }
	

	/**
	 * Style class of the div surrounding the tab pane. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.styleClass);
		return  value;
	}
	
	/**
	 * Style class of the div surrounding the tab pane. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }
	

	/**
	 * Caption of the tab. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTitle() {
		String value = (String)getStateHelper().eval(PropertyKeys.title);
		return  value;
	}
	
	/**
	 * Caption of the tab. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTitle(String _title) {
	    getStateHelper().put(PropertyKeys.title, _title);
    }
	

	/**
	 * The text of the tooltip. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltip);
		return  value;
	}
	
	/**
	 * The text of the tooltip. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
    }
	

	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelay() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelay, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(int _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayHide() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayHide, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(int _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayShow() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayShow, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(int _tooltipDelayShow) {
	    getStateHelper().put(PropertyKeys.tooltipDelayShow, _tooltipDelayShow);
    }
	

	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipPosition() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipPosition);
		return  value;
	}
	
	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipPosition(String _tooltipPosition) {
	    getStateHelper().put(PropertyKeys.tooltipPosition, _tooltipPosition);
    }
	

	/**
	 * Component(s) to be updated with ajax. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getUpdate() {
		String value = (String)getStateHelper().eval(PropertyKeys.update);
		return  value;
	}
	
	/**
	 * Component(s) to be updated with ajax. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setUpdate(String _update) {
	    getStateHelper().put(PropertyKeys.update, _update);
    }
	
}

