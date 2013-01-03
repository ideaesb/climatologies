package org.ideademo.climatologies.pages.climatology;


import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Property;

import org.ideademo.climatologies.entities.Climatology;


public class ViewClimatology
{
	
  @PageActivationContext 
  @Property
  private Climatology entity;
  
  
  void onPrepareForRender()  {if(this.entity == null){this.entity = new Climatology();}}
  void onPrepareForSubmit()  {if(this.entity == null){this.entity = new Climatology();}}
}
