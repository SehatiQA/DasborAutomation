package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object adminusername
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object faskesusername
     
    /**
     * <p></p>
     */
    public static Object dinkesusername
     
    /**
     * <p></p>
     */
    public static Object urladmin
     
    /**
     * <p></p>
     */
    public static Object urllogin
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            adminusername = selectedVariables['adminusername']
            password = selectedVariables['password']
            faskesusername = selectedVariables['faskesusername']
            dinkesusername = selectedVariables['dinkesusername']
            urladmin = selectedVariables['urladmin']
            urllogin = selectedVariables['urllogin']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
