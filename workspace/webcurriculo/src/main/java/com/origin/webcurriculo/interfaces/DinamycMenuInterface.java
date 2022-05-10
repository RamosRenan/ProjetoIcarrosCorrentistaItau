package com.origin.webcurriculo.interfaces;

import java.lang.reflect.Array;

public interface DinamycMenuInterface {
	public String getName();
	public Long getId();
	public String getLink();
	public Long getParent();
	public boolean getNode();
	public boolean getActive();
	public String getdescription();
	public String[] getKeyWords();
}
