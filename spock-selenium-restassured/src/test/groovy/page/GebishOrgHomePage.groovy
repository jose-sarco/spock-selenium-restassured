package page

import geb.Page
import module.ManualsMenuModule

class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module(ManualsMenuModule) }
    }
}
