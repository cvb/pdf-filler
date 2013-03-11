package fme.pdffiller

import java.io.FileOutputStream

import com.itextpdf.text.pdf._
import com.itextpdf.text._

object App {
  def main(args: Array[String]) {
    val pdfin  = "/Users/cvb/tmp/tst.pdf"
    val pdfout = "/Users/cvb/tmp/out.pdf"
    val ffile  = "LiberationMono-Regular.ttf"
    val reader = new PdfReader(pdfin)
    val out    = new FileOutputStream(pdfout)
    val stamp = new PdfStamper(reader, out, '\0')
    val form = stamp.getAcroFields()
    stamp.getWriter().getAcroForm().setNeedAppearances(true)
    val bf = BaseFont.createFont(ffile, BaseFont.IDENTITY_H, true)
    form.addSubstitutionFont(bf)
    form.setField("$VIN$", "scala утф блеать beaches")
    stamp.setFormFlattening(true)
    stamp.close()
  }
}

