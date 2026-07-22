public class University {
    public Department[] departments; // composition: owns Departments
    // TODO: Composition lifecycle note - Departments are owned by University.
    // Diff vs aggregation: composition implies strong ownership — parts
    // (Departments) are conceptually bound to the whole and should be
    // removed/cleaned up when the University is deleted/removed. In
    // real code implement clear ownership responsibilities (factory
    // methods, parent-driven creation/removal, transactional cleanup).
}
