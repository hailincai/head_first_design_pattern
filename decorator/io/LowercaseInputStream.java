package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends FilterInputStream {

    protected LowercaseInputStream(InputStream in) {
        super(in);
    }
    
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? c : Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] buffer, int offset, int len) throws IOException {
        int result = super.read(buffer, offset, len);

        if (result != -1){
            for (int i = offset; i < offset + result; i++){
                buffer[i] = (byte)Character.toLowerCase((char)buffer[i]);
            }
        }

        return result;
    }
}
