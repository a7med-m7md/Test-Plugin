package eg.gov.iti;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.*;

@Mojo(name = "ITI")
public class ITI extends AbstractMojo{
    public void execute(){
        getLog().info("Hello from maven ITI plugin!");
    }
}
