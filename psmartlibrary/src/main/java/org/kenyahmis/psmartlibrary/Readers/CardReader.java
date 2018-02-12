package org.kenyahmis.psmartlibrary.Readers;

import org.kenyahmis.psmartlibrary.Models.WriteResponse;

/**
 * Created by GMwasi on 2/10/2018.
 */

public interface CardReader {

    // Returns:
    //     Data read from the card as byte array
    byte[] ReadCard();

    // Params:
    //Data to be written on card as byte array
    // Returns:
    //     Message stating if written successfully or if not error message
    WriteResponse WriteCard(byte[] data);
}
