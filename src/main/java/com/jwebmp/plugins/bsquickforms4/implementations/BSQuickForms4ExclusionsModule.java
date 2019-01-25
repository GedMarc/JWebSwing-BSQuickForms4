package com.jwebmp.plugins.bsquickforms4.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BSQuickForms4ExclusionsModule
		implements IGuiceScanModuleExclusions<BSQuickForms4ExclusionsModule>,
				           IGuiceScanJarExclusions<BSQuickForms4ExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-quick-forms4-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bsquickforms4");
		return strings;
	}
}