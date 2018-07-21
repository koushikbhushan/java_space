package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;


public class ImageReader {

	public static void main(String[] args) {
		getBase64EncodingForPdfLogo();

	}

	private static String getBase64EncodingForPdfLogo() {
		String encoded = null;
		ClassLoader loader = ImageReader.class.getClassLoader();
		URL resourceURL = loader.getResource("stream/test.png");
		InputStream is = null;
		try {
			if (resourceURL != null) {

				String fileName = resourceURL.getFile().toString();						
				if (fileName != null && !fileName.isEmpty()) {
					File xslFile = new java.io.File(fileName);
					is = new FileInputStream(xslFile);
				}
			}

			byte[] bytes = IOUtils.toByteArray(is);
			encoded = Base64.encodeBase64String(bytes);
			System.out.println(encoded);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return encoded;
	}
}
