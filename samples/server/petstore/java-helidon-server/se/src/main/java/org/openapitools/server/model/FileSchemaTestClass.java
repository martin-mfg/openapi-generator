package org.openapitools.server.model;

import org.openapitools.server.model.ModelFile;



public class FileSchemaTestClass   {

    private ModelFile _file;
    private java.util.List<ModelFile> files;

    /**
     * Default constructor.
     */
    public FileSchemaTestClass() {
    // JSON-B / Jackson
    }

    /**
     * Create FileSchemaTestClass.
     *
     * @param _file _file
     * @param files files
     */
    public FileSchemaTestClass(
        ModelFile _file, 
        java.util.List<ModelFile> files
    ) {
        this._file = _file;
        this.files = files;
    }



    /**
     * Get _file
     * @return _file
     */
    public ModelFile getFile() {
        return _file;
    }

    public void setFile(ModelFile _file) {
        this._file = _file;
    }

    /**
     * Get files
     * @return files
     */
    public java.util.List<ModelFile> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<ModelFile> files) {
        this.files = files;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileSchemaTestClass {\n");
        
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

