package specification.frontend

import geb.spock.GebSpec
import page.GebishOrgHomePage
import page.TheBookOfGebPage

class GebishOrgSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when:
        to GebishOrgHomePage

        and:
        manualsMenu.open()

        then:
        manualsMenu.links[0].text().startsWith("current")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }
}