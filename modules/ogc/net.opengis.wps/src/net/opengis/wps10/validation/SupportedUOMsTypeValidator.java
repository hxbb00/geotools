/**
 *
 * $Id$
 */
package net.opengis.wps10.validation;

import net.opengis.wps10.DefaultType1;
import net.opengis.wps10.UOMsType;

/**
 * A sample validator interface for {@link net.opengis.wps10.SupportedUOMsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SupportedUOMsTypeValidator {
  boolean validate();

  boolean validateDefault(DefaultType1 value);
  boolean validateSupported(UOMsType value);
}