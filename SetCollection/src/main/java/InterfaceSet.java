import java.util.Collection;

public interface InterfaceSet<Toys> extends Iterable<Toys>  {

      boolean add(Toys toy);
      boolean remove(Toys toy);
      int size();
      boolean contains(Toys toy);

}
