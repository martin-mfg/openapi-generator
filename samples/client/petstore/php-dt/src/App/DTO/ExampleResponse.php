<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ExampleResponse
{
    /**
     * @DTA\Data(field="myOnlyProperty", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     * @var \App\DTO\Collection|null
     */
    public $my_only_property;

}
