/**
 * 
 */
package com.fndong.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

/**
 * @author frank
 *
 */
public class mainLayoutView extends mainLayoutDesign implements View {

	/* (non-Javadoc)
	 * @see com.vaadin.navigator.View#enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent)
	 */
	public mainLayoutView(){
		lbl_paragraph.setCaption("<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <br /> Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, <br />when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,<br /> but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, <br />and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.<p>");
		lbl_paragraph.setCaptionAsHtml(true);
		
		// HorizontalLayout sidebar_contain
		sidebar_contain.setSizeFull();
		
		// CssLayout side_menu

		// verticalLayout  content_area
		content_area.setSpacing(true);
		content_area.setMargin(true);
		
		// HorizontalLayout sidebar_contain
		sidebar_contain.setExpandRatio(side_menu, 2);
		sidebar_contain.setExpandRatio(content_area, 8);
	}
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
