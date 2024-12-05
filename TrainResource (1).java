package soa.jaxrslabs.booktrain;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;



@Path("trains")
public class TrainResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TrainResource
     */
    public TrainResource() {
        
    }
    
  

    /**
     * Retrieves representation of an instance of soa.jaxrslabs.booktrain.TrainResource
     * @return an instance of java.lang.String
     */
    /*@GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }*/

    /**
     * PUT method for updating or creating an instance of TrainResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    /*@PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }*/
    
    @GET
    @Produces("application/xml")
    public List<Train> getTrains() { 

    System.out.println("getTrains"); 
    
    return BookTrainBD.getTrains(); 
  

    } 
    
    
    // terminer pourque ça soit accessible par le path /{id}
    public Train getTrain(@PathParam("id") String numTrain) { 

        // completer
        return null; 
    } 
    
    
    // terminer pourque ça soit accessible par le path serach
    public List<Train> searchTrainsByCriteria(@QueryParam("departure") String departure, @QueryParam("arrival") 

      String arrival) { 

        //

        return null; 
    }
    
    // terminer pourque ça soit accessible par le path create
    public void createTrain(@QueryParam("departure") String departure /*completer*/ ) { 
 
    
    }
    // terminer pourque ça soit accessible par le path modify
	 public void modify(@QueryParam("id") String num ,@QueryParam("heure") int h)
    {
       
    } 
	
    // terminer pourque ça soit accessible par le path {id}/remove
    public void remove(@PathParam("id") String num) 
    { 
        
    }
    
    
    
}
