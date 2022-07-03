/**
 * 
 */

/** 
 * @author Administrator
 * @uml.annotations
 *     derived_abstraction="platform:/resource/Steganography/Blank%20Model.emx#_jiHzoOGREeyAwrpWVs0H2A"
 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
import java.util.Scanner;

public class Convert {
	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Object Image;

	/**
	 * @return the Image
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object getImage() {
		
		Scanenr sc = new Scanner(System.in);
		System.out.print("Enter file location: ");
		String img = sc.next();
		return Image;
		
	}

	/**
	 * @param theImage the Image to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setImage(Object theImage) {
		// begin-user-code
		Image = theImage;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Object Text;

	/**
	 * @return the Text
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object getText() {
		// begin-user-code
		return Text;
		// end-user-code
	}

	/**
	 * @param theText the Text to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setText(Object theText) {
		// begin-user-code
		Text = theText;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Object BinaryData;

	/**
	 * @return the BinaryData
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object getBinaryData() {
		// begin-user-code
		return BinaryData;
		// end-user-code
	}

	/**
	 * @param theBinaryData the BinaryData to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBinaryData(Object theBinaryData) {
		// begin-user-code
		BinaryData = theBinaryData;
		// end-user-code
	}

	/** 
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Object Pixels;

	/**
	 * @return the Pixels
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Object getPixels() {
		// begin-user-code
		return Pixels;
		// end-user-code
	}

	/**
	 * @param thePixels the Pixels to set
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPixels(Object thePixels) {
		// begin-user-code
		Pixels = thePixels;
		// end-user-code
	}

	/**
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ConvertToBinary() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/**
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void CheckDataType() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/**
	 * @generated "UML to Java V5.0 (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void UnsupportedTypeError() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}
