/*!
* Copyright 2002 - 2017 Webdetails, a Hitachi Vantara company.  All rights reserved.
*
* This software was developed by Webdetails and is provided under the terms
* of the Mozilla Public License, Version 2.0, or any later version. You may not use
* this file except in compliance with the license. If you need a copy of the license,
* please go to  http://mozilla.org/MPL/2.0/. The Initial Developer is Webdetails.
*
* Software distributed under the Mozilla Public License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
* the license for the specific language governing your rights and limitations.
*/

package pt.webdetails.cpk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.pentaho.platform.api.engine.IPluginLifecycleListener;
import org.pentaho.platform.api.engine.PluginLifecycleException;
import pt.webdetails.cpf.PentahoPluginEnvironment;
import pt.webdetails.cpf.PluginEnvironment;
import pt.webdetails.cpf.SimpleLifeCycleListener;

public class CpkLifecycleListener extends SimpleLifeCycleListener implements IPluginLifecycleListener {

    static Log logger = LogFactory.getLog(CpkLifecycleListener.class);

    @Override
    public void init() throws PluginLifecycleException {
         //super.init();
        logger.info("Initializing CPK plugin");
    }

    //@Override
    public void loaded() throws PluginLifecycleException {
       //super.init();
        logger.info("CPK plugin loaded");

    }

    //@Override
    public void unLoaded() throws PluginLifecycleException {
        logger.info("CPK plugin unloaded");

    }

  @Override public PluginEnvironment getEnvironment() {
    return PentahoPluginEnvironment.getInstance();  //To change body of implemented methods use File | Settings | File Templates.
  }
}
