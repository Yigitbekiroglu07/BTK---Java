public interface IEntitiyRepository<T extends IEntitiy> {
    void add(T entity); // Entity, veritabanı nesnesi.
    void delete(T entity);
    void update(T entity);
}
