<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * dummy
 */
class ExampleResponse
{
    /**
     * @DTA\Data(field="myOnlyProperty", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OtherObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OtherObject::class})
     * @var \App\DTO\OtherObject|null
     */
    public $my_only_property;

}
