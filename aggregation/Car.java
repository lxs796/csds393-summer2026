public class Car {
    public Wheel[] wheels;
    // shell: aggregation to Wheel (multiplicity 4)
    // TODO: Aggregation lifecycle note - Wheels are shared (aggregation).
    // Diff vs composition: aggregation means parts can exist independently
    // of the whole; a Wheel may outlive its Car. In real code implement
    // ownership management (e.g., shared references, registries or
    // reference counting) so Wheel instances are not removed when a Car
    // is deleted/removed accidentally.
}
