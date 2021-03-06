package hu.juzraai.ted.xml.model.test

import hu.juzraai.ted.xml.model.TedXmlModel
import org.junit.Test

/**
 * Very simple test verifying that Simple XML framework can
 * parse a TED-XML using this model without any exception.
 *
 * @author Zsolt Jurányi
 */
class SimpleTest {

	// TODO test a bunch of XMLs, e.g. the 1st daily packages 2011..2017

	@Test
	fun testSchemaR209() {
		var tedExport = TedXmlModel.parse("schema209/460330_2016.xml")
		with(tedExport) {
			println("docId = $docId")
			println("edition = $edition")
			println("version = $version")

			println(technicalSection)

			println(linksSection)

			println(sender)

			println(codedDataSection.codifData)
			println(codedDataSection.noticeData)
			println(codedDataSection.refOjs)

			println(translationSection)
		}
	}

	@Test
	fun testSchemaR209_2019() {
		var tedExport = TedXmlModel.parse("schema209/590306_2019.xml")
		with(tedExport) {
			println("docId = $docId")
			println("edition = $edition")
			println("version = $version")

			println(technicalSection)

			println(linksSection)

			println(sender)

			println(formSection)

			println(codedDataSection.codifData)
			println(codedDataSection.noticeData)
			println(codedDataSection.refOjs)

			println(translationSection)
		}
	}

	@Test
	fun testSchemaR209_2019_f2_2014() {
		var tedExport = TedXmlModel.parse("schema209/590317_2019.xml")
		with(tedExport) {
			println("docId = $docId")
			println("edition = $edition")
			println("version = $version")

			println(technicalSection)

			println(linksSection)

			println(sender)

			println(formSection)

			println(codedDataSection.codifData)
			println(codedDataSection.noticeData)
			println(codedDataSection.refOjs)

			println(translationSection)

			println(formSection.contractNotices[0].contract.objectDescriptions[0].shortDescr)
			println("CPV Main = ${formSection.contractNotices[0].contract.cpvMain.code.code}")
		}
	}

	@Test
	fun testSchemaR209_2020() {
		var tedExport = TedXmlModel.parse("schema209/361581_2020.xml")
		with(tedExport) {
			println("docId = $docId")
			println("edition = $edition")
			println("version = $version")

			println(technicalSection)

			println(linksSection)

			println(sender)

			println(formSection)

			println(codedDataSection.codifData)
			println(codedDataSection.noticeData)
			println(codedDataSection.refOjs)

			println("Official name")
			println(formSection.contractNotices[0].contractingBody.address.officialname)

			println(translationSection)
			println("Additional CPVs = ${formSection.contractNotices[0].contract.objectDescriptions[0].additionalCPVs}")
		}
	}
}
