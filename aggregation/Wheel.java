public class Wheel {
    // shell: no behavior
    // NOTE: Aggregation participant — Wheel is a shared part.
    // Aggregation implies Wheels' lifecycle is independent of a Car; a
    // Wheel may be reused or removed separately. Real implementations
    // should handle sharing (e.g., avoid deleting Wheel when removing
    // a Car, use shared references or registries — TODO).
}
