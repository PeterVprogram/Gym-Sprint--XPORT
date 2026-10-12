
document.querySelectorAll('.select-estado').forEach(select => {
  select.addEventListener('change', function () {
    const punto = this.parentElement.querySelector('.punto');

    // Quitar colores anteriores
    punto.classList.remove('verde', 'rojo');

    // Agregar el color seleccionado
    punto.classList.add(this.value);
  });
});